package com.example.forestmaster;

import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.annotation.*;
import org.springframework.stereotype.Component;

import java.io.File;

@Component

public interface MyClient {

    @BodyType("multipart")
    @Post(url = "https://api.ocr.space/parse/image", contentType = "multipart/form-data")
    JSONObject helloForest(@Header("apiKey") String apiKey, @DataFile("file") File file, @Body("language") String language
            , @Body("isOverlayRequired") boolean isOverlayRequired, @Body("OCREngine") int OCREngine);

    @Post(url = "https://api.openai.com/v1/completions",
            contentType = "application/json",
            headers = {"Authorization:Bearer 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"},
            data = {"{\"model\":\"text-davinci-003\",\"prompt\":\"${0}\",\"max_tokens\":70,\"temperature\":0}",}
    )
    String chatGPT(String text);
}


