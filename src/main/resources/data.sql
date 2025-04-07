-- Users
INSERT INTO user (id, name, email) VALUES (1, 'John Doe', 'john@example.com');
INSERT INTO user (id, name, email) VALUES (2, 'Jane Smith', 'jane@example.com');

-- User Books
INSERT INTO user_book (id, title, author, user_id) VALUES (1, 'Spring in Action', 'Craig Walls', 1);
INSERT INTO user_book (id, title, author, user_id) VALUES (2, 'Clean Code', 'Robert Martin', 2);

-- User Universities
INSERT INTO user_university (id, name, degree, user_id) VALUES (1, 'Harvard University', 'Bachelor of Science', 1);
INSERT INTO user_university (id, name, degree, user_id) VALUES (2, 'MIT', 'Master of Science', 2);

-- User Courses
INSERT INTO user_course (id, name, description, user_id) VALUES (1, 'Introduction to Computer Science', 'CS101 course', 1);
INSERT INTO user_course (id, name, description, user_id) VALUES (2, 'Advanced Algorithms', 'CS401 course', 2);
