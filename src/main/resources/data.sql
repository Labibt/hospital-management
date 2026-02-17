-- Dummy data for Patient entity

INSERT INTO patient (name, birth_date, email, gender, blood_group, created_at) VALUES
('Alice Smith', '1990-05-12', 'alice.smith@example.com', 'F', 'A_POSITIVE', NOW()),
('Bob Johnson', '1985-11-23', 'bob.johnson@example.com', 'M', 'A_POSITIVE', NOW()),
('Carol Williams', '1992-07-04', 'carol.williams@example.com', 'F', 'B_POSITIVE', NOW()),
('David Brown', '1980-03-18', 'david.brown@example.com', 'M', 'B_POSITIVE', NOW()),
('Eva Davis', '1995-09-30', 'eva.davis@example.com', 'F', 'AB_POSITIVE', NOW());

-- Notes:
-- 1. 'email' is UNIQUE, so no duplicates.
-- 2. 'name' + 'birth_date' is also unique due to the unique constraint.
-- 3. 'created_at' is automatically set via @CreationTimestamp, but we insert NOW() to simulate existing records.
-- 4. 'bloodgroup' added for patient blood type.
