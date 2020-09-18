package com.in28minutes.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class VoteTest {

    @Spy
    Vote vote;

    @Test
    public void isEligibleToVote_test(){
        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
        vote.isEligibleToVote(18);
        //vote.isEligibleToVote(19);
        //verify(vote).getResult(stringArgumentCaptor.capture());
        //the above won't work because we are calling isEligibleTOVote two times
        //and bydefault verify(vote).getResult have 1 times in so we have to use something like below
        //verify(vote,times(2)).getResult(stringArgumentCaptor.capture());
        verify(vote).getResult(stringArgumentCaptor.capture());
        //verify(vote).getResult("no"); // failes because verify needs correct input from the result
        assertEquals("yes", stringArgumentCaptor.getValue());
    }
}
