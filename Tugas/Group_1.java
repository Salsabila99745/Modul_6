/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Group_1 {
    //sesudah proses refactoring
    public List getUsersSortedByMostRecentlyRegistered(){
	List users = new ArrayList();
	if(!userDirectoryExists ())
            return users;
            addFoundUsersTo(users);
            SortByMostRecentlyRegistered(users);
            return users;
    }
}
