/*package com.vig.shop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

*//**
 * Handles requests for the application file upload requests
 *//*
@Controller
public class FileUploadController {

	//private static final Logger logger = LoggerFactory
			//.getLogger(FileUploadController.class);

	*//**
	 * Upload single file using Spring Controller
	 *//*
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public 
	String uploadFileHandler(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath ="E:/";
				File dir = new File(rootPath + File.separator + "");
				if (!dir.exists())
					dir.mkdirs();
				
				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile +".jpg"));
				stream.write(bytes);
				stream.close();

				//logger.info("Server File Location="
			//			+ serverFile.getAbsolutePath());

				return "redirect:/frontcrud";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
	}

	*//**
	 * Upload multiple file using Spring Controller
	 *//*
	@RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	public @ResponseBody
	String uploadMultipleFileHandler(@RequestParam("name") String[] names,
			@RequestParam("file") MultipartFile[] files) {

		if (files.length != names.length)
			return "Mandatory information missing";

		String message = "";
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			String name = names[i];
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath ="/D:Downloads/";
				File dir = new File(rootPath + File.separator + "");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile +"jpg"));
				stream.write(bytes);
				stream.close();

				//logger.info("Server File Location="
					//	+ serverFile.getAbsolutePath());

				message = message + "You successfully uploaded file=" + name
						+ "";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		}
		return message;
	}
}
*/
/*
package com.vig.shop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileUploadController {
	
	
	@RequestMapping("/uploadFile")
	public String getfile()
	{
		return"fileupload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody String uploadFileHandler(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = "F:/laptop/src/main/webapp/resources/pics";
				File dir = new File(rootPath + File.separator + "upload");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name + ".jpg");
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				System.out.println(serverFile);
				stream.write(bytes);
				stream.close();

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name + " because the file was empty.";
		}
	}

}
*/