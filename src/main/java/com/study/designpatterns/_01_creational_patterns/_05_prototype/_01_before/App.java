package com.study.designpatterns._01_creational_patterns._05_prototype._01_before;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        repository.setUser("Kadun");

        // TODO clone != githubIssue
        // TODO clone.equals(githubIssue) => true
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println(clone.getUrl());

//        clone.setId(2);
//        clone.setTitle("2주차 과제: 자바 데이터 타입, 변수 그리고 배열");
    }
}
