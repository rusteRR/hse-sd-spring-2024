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

ProgramName: [a-z][a-z0-9_\-]*;
Arg: [a-zA-Z0-9_\-]+;
Value: (~['"\r\n\t])+;
EnvVar: [a-z][a-z0-9_\-]*;

// Lexer rules
QUOTA: '\'';
DQUOTA: '"';
STRING: (~["\r\n])+;
WS: [ \t\r\n]+ -> skip;
