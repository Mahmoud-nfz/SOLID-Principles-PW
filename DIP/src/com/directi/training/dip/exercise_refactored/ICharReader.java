package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

interface ICharReader
{
    char readChar() throws IOException ;
    boolean hasMore() ;
    void close() throws IOException ;
}
