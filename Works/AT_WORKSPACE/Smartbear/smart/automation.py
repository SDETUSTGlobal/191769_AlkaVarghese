from selenium import webdriver  
import time  
from selenium.webdriver.common.keys import Keys  
from selenium.webdriver.support.ui import Select
print("test case started")  
 
driver = webdriver.Chrome("E:\eclipse\chromedriver_win32\chromedriver.exe")  
  
driver.maximize_window()  

#driver.delete_all_cookies()  

driver.get("http://127.0.0.1:5000/");

driver.find_element_by_id("fname").send_keys("ANVIN");
time.sleep(3)

driver.find_element_by_id("userid").send_keys("AI0078");
time.sleep(3)

driver.find_element_by_id("cmpnyname").send_keys("BPCL");
time.sleep(3)

driver.find_element_by_id("idmail").send_keys("anvin@gmail.com");
time.sleep(3)

driver.find_element_by_id("bttnname").click();
time.sleep(3)

driver.close();
