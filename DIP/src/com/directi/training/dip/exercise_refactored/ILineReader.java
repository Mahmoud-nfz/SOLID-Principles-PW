package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

interface ILineReader
{
    String readLine() throws IOException ;
    void close() throws IOException ;
}
