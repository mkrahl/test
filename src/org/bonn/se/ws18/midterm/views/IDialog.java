package org.bonn.se.ws18.midterm.views;

import java.util.List;

import org.bonn.se.ws18.midterm.dtos.UserStoryDTO;

public interface IDialog {

    public void display( List<UserStoryDTO> list );

}