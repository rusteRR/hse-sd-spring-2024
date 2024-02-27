grammar CLI;

@header {
package hse.cli.antlr;
}

// Parser rules
input: token*;
token: program | envVarSet;
program: ProgramName surrArg*;
surrArg: Arg | QUOTA Arg QUOTA | DQUOTA Arg DQUOTA;
envVarSet: EnvVar '=' surrValue;
surrValue: Value | QUOTA Value QUOTA | DQUOTA Value DQUOTA;

ProgramName: [a-z][a-z0-9_\-]*;
Arg: [a-zA-Z0-9_\-]+;
Value: (~['"\r\n\t])+;
EnvVar: [a-z][a-z0-9_\-]*;

// Lexer rules
QUOTA: '\'';
DQUOTA: '"';
WS: [ \t\r\n]+ -> skip;
