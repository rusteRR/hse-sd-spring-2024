grammar CLI;

@header {
package hse.cli.antlr;
}

// Lexer rules
fragment LOWERCASE  : [a-z];
fragment UPPERCASE  : [A-Z];
fragment DIGIT : [0-9];
fragment QUOTA: '\'';
fragment DQUOTA: '"';
fragment EOL: [\r\n];
fragment ALL: ~['"];


EnvVar: UPPERCASE (UPPERCASE | DIGIT | '_' | '-')+;
CommandName: LOWERCASE (LOWERCASE | DIGIT | '_' | '-')+;
Arg: SPACE (LOWERCASE | UPPERCASE | DIGIT | '_' | '-')+;
StrValue: QUOTA (ALL)+ QUOTA | DQUOTA (ALL)+ DQUOTA;
NumValue: DIGIT+ ([.,] DIGIT+)?;
SPACE: [\t ];
PIPE: SPACE* '|' SPACE*;

// Parser rules
input: (token PIPE)* token? (EOF | EOL+);
token: SPACE* (command | envVarSet) SPACE*;
command: CommandName surrArg*;
surrArg: SPACE* Arg;
envVarSet: EnvVar surrValue;
surrValue: '=' (NumValue | StrValue);

