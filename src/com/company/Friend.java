package com.company;

import java.util.*;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean recursiveDFS(Friend friend, HashSet<String> isVisited){
        isVisited.add(this.email);
        if(this.friends.contains(friend))
            return true;
        for(Friend f: friends)
            if(!isVisited.contains(f.getEmail()))
                return friend.recursiveDFS(f,isVisited);

        return false;
    }

    public boolean canBeConnected(Friend friend) {
        HashSet<String> isVisited = new HashSet<>();
        return recursiveDFS(friend,isVisited);
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("D");
        Friend x = new Friend("X");
        Friend y = new Friend("Y");

        a.addFriendship(b);
        b.addFriendship(c);
        c.addFriendship(d);;
        y.addFriendship(x);
        d.addFriendship(y);
        System.out.println(x.canBeConnected(a));
    }
}