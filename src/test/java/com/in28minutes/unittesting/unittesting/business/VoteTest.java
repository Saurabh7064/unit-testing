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
        verify(vote).getResult(stringArgumentCaptor.capture());
        assertEquals("yes", stringArgumentCaptor.getValue());
    }
}
