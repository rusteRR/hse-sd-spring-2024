grammar CLI;

@header {
   package hse.cli;
}

// Lexer rules
QUOTA: '\'';
DQUOTA: '\'';
WS: [ \t\r\n]+ -> skip;

// Parser rules
input: Program | EnvVarSet;
Program: Name SurrArg*;
SurrArg: Arg | QUOTA Arg QUOTA | DQUOTA Arg DQUOTA;
EnvVarSet: EnvVar '=' SurrValue;
SurrValue: Value | QUOTA Value QUOTA | DQUOTA Value DQUOTA;
