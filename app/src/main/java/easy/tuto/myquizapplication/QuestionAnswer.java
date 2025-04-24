package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[] ={
            "What programming language is commonly used for developing Android apps?",
            "What is the file extension for an Android app package file?",
            "What is the name of the XML file that describes the layout of an Android app's user interface?",
            "What is the name of the tool used for debugging Android apps?",
            "What is the purpose of the public static void main(String[] args) method in a Java program?",
            "Which keyword is used to create a new instance of a class in Java?",
            "What is the name of the Java class that all other classes implicitly inherit from?",
            "Which data type is used to store a single character in Java?",
            "What does XML stand for?",
            "What is the syntax for creating an XML comment?"
    };

    public static String choices[][] = {
            {"Java","C++","Python","JavaScript"},
            {".apk",".ipa",".exe",".app"},
            {" MainActivity.java"," styles.xml","AndroidManifest.xml","activity_main.xml"},
            {"Android Debug Bridge (ADB)","Eclipse","Android Studio Debugger","Android Monitor"},
            {"To create a new object","To initialize the program's variables","To define the program's entry point"," To define a loop"},
            {"this","super","new","final"},
            {"Object","String","Integer","Class"},
            {"char","int","float","double"},
            {"eXtreme Markup Language","eXtensible Markup Language","eXtraordinary Markup Language","eXperimental Markup Language"},
            {"/* This is a comment */ ","# This is a comment"," <!-- This is a comment -->"," // This is a comment"}


    };

    public static String correctAnswers[] = {
            "Java",
            ".apk",
            "activity_main.xml",
            "Android Studio Debugger",
            "To define the program's entry point",
            "new",
            "Object",
            "char",
            "eXtensible Markup Language",
            "<!-- This is a comment -->"

    };

}
