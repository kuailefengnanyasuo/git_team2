package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/uploads")
public class UploadController {

    @RequestMapping("/uploadFile.do")
    public @ResponseBody boolean uploadFile(@RequestParam(name = "bigHeadImg") MultipartFile file) {
        try {
            //orname:文件上传的原始名1.jpg
            String orname = file.getOriginalFilename();
            //1.取出后缀名 .jpg .png
            String es = orname.substring(orname.lastIndexOf("."));
            //2.通过uuid作为文件的名字
            String uuid = UUID.randomUUID().toString();
            //动态生成图片的保存的目录结构
            Date date = new Date();
            SimpleDateFormat adf = new SimpleDateFormat("yyyyMMdd\\HH\\mm\\ss");
            String format = adf.format(date);//20190315\\10\\00\\20
            File saveFile = new File("D:\\uploads\\" + format);
            if (!saveFile.exists()) {
                saveFile.mkdirs();
            }
            File file1 = new File(saveFile, "\\" + uuid + es);
            file.transferTo(file1);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

}
