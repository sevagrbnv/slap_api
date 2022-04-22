package com.example.slap_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Gorbunov Vsevolod
 * @version 1.0
 *
 *  <br>
 *  <div align="center">
 *  	<img
 *  	width="200px" height="200px"
 *  	src="https://sun1-14.userapi.com/s/v1/if2/DsDkkgeCjcCV8KrcXjbBSKvCUtC8Vi9o8E06oyZgbTd4jOTe6nF0eH8Ij2etxpWA1Zz990GWvqxwJ_9tfTBWvubP.jpg?size=1280x1077&quality=96&type=album"
 *  </div>
 *  <br>
 *  <div align="left">
 * 	Сей код является API приложения SLAP.
 * 	SLAP - ультимативный современный таск-трекер,
 * который прекрасно зарекомендовал себя как в огромном числе мелких компаний
 * для управления корпоративными задачами, так и в группах простых людей,
 * использующих его в повседневной жизни.
 *
 * <br><br>
 * Среди достоинств наши клиенты выделяют:<br>
 * 	- Удобный современный и запоминающийся дизайн<br>
 * 	- Высокую скорость работы<br>
 * 	- Простота использования и легкий переход с других платформ<br>
 * 	- Отсутствие навязывания методологий ведения управления проектом<br>
 * 	- Отзывчивая техподдержка и регулярный выпуск обновлений,<br>
 * 			улучшающих пользовательский опыт
 *
 *  Вы спросите: "Would you slap your best friend for 1 million dollars?"<br>
 *  Наш клиент ответит: "I slap my best friend for free"<br>
 * </div>
 * <br>
 * <div align="center">
 *	 <img
 *	 width="700px" height="500px"
 *	 src="https://www.fg24.ru/uploads/posts/2020-09/1601004068_5c7801832500001c0580ad87.jpeg" >
 * </div>
 * <br><br><br>
 *
 *
 * Терминология проекта:<br><br>
 *
 * Борд (board) - доска<br>
 * Task (task) - задача<br>
 * Юзер (user) - пользователь<br>
 * ЮзерБорд (userBoard) - связь между бордом и юзером<br>
 * </div>
 */

@SpringBootApplication
public class SlapApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlapApiApplication.class, args);
	}

}
