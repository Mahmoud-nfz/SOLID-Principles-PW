package com.directi.training.ocp.exercise_refactored;

interface IResource
{
    int findFreeSlot() ;
    int markSlotBusy(int resourceId) ;
    int markSlotFree(int resourceId) ;
}
