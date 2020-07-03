CREATE DATABASE `wish`
/*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */
/*!80016 DEFAULT ENCRYPTION='N' */
;

CREATE TABLE `wish` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20) NOT NULL,
    `content` varchar(255) NOT NULL,
    `created_at` datetime NOT NULL,
    `updated_at` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `wish` (`name`, `content`, `created_at`)
VALUES
    ('小王', '今天天气好吗', '2020-07-02 12:49:04');

INSERT INTO
    `wish` (`name`, `content`, `created_at`)
VALUES
    ('小华', '向天再借五百年', '2020-06-02 12:49:04');