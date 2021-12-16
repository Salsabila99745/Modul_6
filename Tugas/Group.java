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
public class Group {
    //sebelum proses refactoring
    // Gets users sorted by the most recently registered user 
    public List getUsers(){
	List users = new ArrayList();
	if(!new File(persistencePath()).exists())
            return users;
            File[] files = new File(persistencePath()).listFiles();
            for(File file : files)
		if (file.isDirectory())
                    users.add(new User(file.getName(), this));
                    Collections.sort(users, new User.UserComparatorByDescendingRegistration());
                    return users;
	}
}
