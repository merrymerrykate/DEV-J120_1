package com.company;

import java.util.Objects;



public class PhoneNumber {

    private  final String areaCode;
    private String phoneNum;
    private String strNum;


    public PhoneNumber(String areaCode, String phoneNum){
        checkValue( areaCode, "area code");
        checkValue(phoneNum, "local number");
        this.areaCode = areaCode;
        this.phoneNum = phoneNum;
    }

    private void checkValue(String value, String partName){
        if(value == null)
            throw new NullPointerException("'"+ partName+"'");
        if (value.length()==0)
            throw new IllegalArgumentException("'" + partName+ "string is empty");
        for (int i = 0; i < value.length(); i++){
            char ch = value.charAt(i);
            if (!Character.isDigit(ch))
                throw new IllegalArgumentException("'" + partName+ "contains illegal characters ");


        }



    }

    public String getAreaCode{
        return areaCode;
    }

    public String getPhoneNum{
        return phoneNum;
    }

    @Override
    public int hashCode(){
        return Objects.hash(areaCode, phoneNum);
    }

    @Override
    public boolean equals (Object obj){
        if (strNum == obj)
            return true;
        if(!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber other = (PhoneNumber) obj;
            return this.areaCode.equals(other.areaCode)&&this.phoneNum.equals(other.phoneNum);


    }

    @ public String toString(){
        if(strNum == null)
        {
            String sb = new String();
            int start;
            sb.append('(').append(areaCode).append(')');
            if(phoneNum.length()==7){
                start = 3;
                sb.append(phoneNum, 0,start);
            }
            else if (phoneNum.length()==6){
                start = 2;
                sb.append(phoneNum, 0,start);
            }
            sb.append('-').append(phoneNum, start, start + 2);
            sb.append('-').append(phoneNum, start + 2,start +4 );

            return strNum = sb;

        }
    }





}
