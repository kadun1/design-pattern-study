package com.study.designpatterns._02_structural_patterns._09_decorator._02_after;

public class SpamFilterCommentDecorator extends CommentDecorator {

    public SpamFilterCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
