package com.robotson.javabeans;

import com.robotson.javabeans.Preference;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T11:48:23")
@StaticMetamodel(Musicien.class)
public class Musicien_ { 

    public static volatile SingularAttribute<Musicien, String> image;
    public static volatile ListAttribute<Musicien, Preference> listePreferences;
    public static volatile SingularAttribute<Musicien, Boolean> laser;
    public static volatile SingularAttribute<Musicien, Integer> idMusicien;
    public static volatile SingularAttribute<Musicien, String> nom;

}