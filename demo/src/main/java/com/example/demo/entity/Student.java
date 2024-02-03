package com.example.demo.entity;


    public class Student {
        private int Stud_id;
        private String name;
        private String Bookdescription;

        public int getStudId()
        {
            return Stud_id;
        }

        public String getStudName()
        {
            return name;
        }

        public String getBookdescription()
        {
            return  Bookdescription;
        }

        public void setStudId(int studid)
        {
            Stud_id = studid;
        }

        public void setStudName(String studName)
        {
            name = studName;
        }

        public void setBookdescription(String BookDescrip)
        {
            Bookdescription = BookDescrip;
        }


    }

