package com.example.slap_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для получения досок и всего их содержимого по id юзера
 */
@RestController
@RequestMapping("/getall")
public class AllContoller {

    /**
     * Метод для получения досок и их содержимого
     * способ вызова:
     * http://{ip-address}:8080/getall?id={id}
     * @param id
     * @return json (в качестве примера fakeJson)
     * @
     */
    @GetMapping
    public ResponseEntity getAll(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(fakeJson);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * Пример возвращаемого json файла
     */
    String fakeJson = "{\n" +
            "  \"boards\" : [\n" +
            "    {\n" +
            "      \"board_id\" : 1,\n" +
            "      \"name\" : \"firstBoard\",\n" +
            "      \"color\" : \"#F67A7A\",\n" +
            "      \"isGroup\" : \"0\",\n" +
            "      \"role\" : \"master\",\n" +
            "      \"columns\" : [\n" +
            "        {\n" +
            "          \"column_id\" : 3,\n" +
            "          \"name\" : \"firstColumn\",\n" +
            "          \"tasks\" : {\n" +
            "            \"task_id\" : 2,\n" +
            "            \"name\" : \"simpleTask\",\n" +
            "            \"desc\" : \"\",\n" +
            "            \"start_date\" : \"2022-03-12\",\n" +
            "            \"end_date\" : \"\"\n" +
            "          },\n" +
            "          \"tasks\" : {\n" +
            "            \"task_id\" : 5,\n" +
            "            \"name\" : \"HardTask\",\n" +
            "            \"desc\" : \"help me, pls\",\n" +
            "            \"start_date\" : \"\",\n" +
            "            \"end_date\" : \"\"\n" +
            "          }\n" +
            "        },\n" +
            "        {\n" +
            "          \"tasks\" : {\n" +
            "            \"task_id\" : 12,\n" +
            "            \"name\" : \"HardTask\",\n" +
            "            \"desc\" : \"AAAAAAAAAAAA\",\n" +
            "            \"start_date\" : \"\",\n" +
            "            \"end_date\" : \"2133-05-01\"\n" +
            "          }\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "  {\n" +
            "      \"board_id\" : 2,\n" +
            "      \"name\" : \"MyBoard\",\n" +
            "      \"color\" : \"#E33030\",\n" +
            "      \"isGroup\" : \"1\",\n" +
            "      \"role\" : \"master\",\n" +
            "      \"columns\" : [\n" +
            "        {\n" +
            "          \n" +
            "          \"tasks\" : {\n" +
            "            \"task_id\" : 63,\n" +
            "            \"name\" : \"its easy\",\n" +
            "            \"desc\" : \"kill me, pls\",\n" +
            "            \"start_date\" : \"\",\n" +
            "            \"end_date\" : \"\"\n" +
            "          }\n" +
            "        },\n" +
            "        {\n" +
            "          \"tasks\" : {\n" +
            "            \"task_id\" : 999,\n" +
            "            \"name\" : \"ImposibleTask\",\n" +
            "            \"desc\" : \"Паш, удачи)))\",\n" +
            "            \"start_date\" : \"2022-04-12\",\n" +
            "            \"end_date\" : \"2022-04-12\"\n" +
            "          }\n" +
            "        }\n" +
            "      ]\n" +
            "    } \n" +
            "  ] \n" +
            "}";
}
