package com.easy4lazy.proj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 * CHECK THE VoteDao interface for more info
 */
@Repository("mysql")
public class VoteMySqlDataAccessCaller implements VoteDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VoteMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public int voteQuestionUp(int contentId, int userId, String tokens) {
        return 0;
    }

    @Override
    public int voteQuestionDown(int contentId, int userId, String tokens) {
        return 0;
    }

    @Override
    public int voteAnswerUp(int contentId, int userId, String tokens) {
        return 0;
    }

    @Override
    public int voteAnswerDown(int contentId, int userId, String tokens) {
        return 0;
    }

    @Override
    public int getTotalQuestionVoteUp() {
        return 0;
    }

    @Override
    public int getTotalQuestionVoteDown() {
        return 0;
    }

    @Override
    public int getTotalAnswerVoteUp() {
        return 0;
    }

    @Override
    public int getTotalAnswerVoteDown() {
        return 0;
    }
}
