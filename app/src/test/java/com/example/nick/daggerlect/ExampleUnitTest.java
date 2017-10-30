package com.example.nick.daggerlect;

import android.util.Log;

import com.example.nick.daggerlect.api.SuperApi;
import com.example.nick.daggerlect.presenter.ISuperPresenter;
import com.example.nick.daggerlect.presenter.SuperPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Mock
    protected SuperApi superApi;

    @InjectMocks
    private ISuperPresenter superPresenter = new SuperPresenter();

    @Before
    public void init(){
        when(superApi.doAwesomeThing()).thenReturn("Test awesome thing done");
    }

    @Test
    public void addition_isCorrect() throws Exception {

        System.out.println("========="+superPresenter.doAwesomeThing()+"============");
        assertEquals(4, 2 + 2);
    }
}