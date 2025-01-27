package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.model.Question;

public interface QuestionDao {
    /**
     * post a question to the db
     * @param question, userId, token CHECK: if user is logged in
     * @return {questionId:int, message:String} a json object
     *  questionId  : id of the content in the content table
     */
    String postQuestion(int userId, String token, Question question);

    /**
     *  return the question with the id
     * @param questionId : id of the content in the content table
     * @return @return {
     *      *      subject, body, createdDate, id, name of user, tags, answerCount,commentCount like, dislike,
     *      *      myvote e.g "like", "dislike" or ""
     *      * } a json array string of all questionsa Question class as json string
     */
    String getQuestion(int questionId);

    /**
     * returns all questions
     * @return [{
     *      subject, body, createdDate, id, name of user, tags, answerCount, like, dislike,
     *      myvote e.g "like", "dislike" or ""
     * }] a json array string of all questions
     */
    String getAllQuestions();

    /**
     * user delete HIS/HER OWN question ONLY if it has no comment or answer
     * @param userId
     * @param token //for isUserLoggedIn
     * @param contentId //id of the comment
     * @return { true/false, message}
     */
    String deleteQuestion(int userId, String token, int contentId);

    /**
     * user edit HIS/HER OWN question
     * @param userId
     * @param token //for isUserLoggedIn
     * @param question //id of the comment
     * @return { true/false, message}
     */
    String editQuestion(int userId, String token, Question question);

    /**
     *
     * @return  the total numbers of questions
     * we need it for the dashboard
     */
    int getTotalQuestionsCount();






}
