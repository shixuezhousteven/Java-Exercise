package com.example.demo;

import com.example.demo.domain.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class Demo220723Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo220723Application.class, args);
		People a = new People("Steve",1997,6,24);
		People b = new People("John",1980,8,15);
		People c = new People("Mary",1999,1,29);
		People d = new People("Karen",2004,12,2);
		List<People> people = new ArrayList<People>();
		people.add(a);
		people.add(b);
		people.add(c);
		people.add(d);

		System.out.println(getFriendBirthday(people,"Steve"));
		System.out.println(getAge(b,2022));

	}




	public static Integer getFriendBirthday  (List<People> people, String name){
		for (int i =0; i < people.size();i++){
			if (people.get(i).getName() == name){
				return people.get(i).getBirthdayDay() + 100*people.get(i).getBirthdayMonth();
			}
		}
		return 0;
	}

	public static Integer getAge  (People people, Integer year) {
		return year - people.getBirthdayYear();
	}

	public static List getBirthMonthFriends  (List<People> people, Integer Mon) {
		List<People> res = new ArrayList<People>();
		for (int i =0; i < people.size();i++){
			if (people.get(i).getBirthdayMonth() == Mon){

				res.add(people.get(i));
			}
		}
		return res;
	}



}
