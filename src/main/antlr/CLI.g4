grammar CLI;

@header {
   package hse.cli;
}

// Parser rules
input: Token*;
Token: Program | EnvVarSet;
Program: ProgramName SurrArg*;
SurrArg: Arg | QUOTA Arg QUOTA | DQUOTA Arg DQUOTA;
EnvVarSet: EnvVar '=' SurrValue;
SurrValue: Value | QUOTA Value QUOTA | DQUOTA Value DQUOTA;

ProgramName: 'cat' | 'echo' | 'exit' | 'pwd' | 'wc';
Arg: STRING;
Value: STRING;
EnvVar: STRING;

// Lexer rules
QUOTA: '\'';
DQUOTA: '"';
STRING: (~["\r\n])+;
WS: [ \t\r\n]+ -> skip;
