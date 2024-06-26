package com.study.designpatterns._02_structural_patterns._09_decorator._01_before;

public class Client {

    private CommentService commentService;

    private boolean enabledSpamFilter;

    private boolean enabledTrimming;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://naver.com");
    }
}
