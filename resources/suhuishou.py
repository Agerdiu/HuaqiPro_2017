from urllib import request
import json
import re
from http import cookiejar
def GetUrl(url,cookie):
    try:
        opener=request.build_opener(request.HTTPCookieProcessor(cookie))
        Request=request.Request(url)
        Response=opener.open(Request)
        result=Response.read()
        return result
    except:
        return

def PostUrl(url,data,cookie,header):
    try:
        opener = request.build_opener(request.HTTPCookieProcessor(cookie))
        Request = request.Request(url=url,data=data,headers=header)
        Response = opener.open(Request)
        result = Response.read()
        return result
    except:
        return


if __name__=="__main__":
    url = 'http://www.suhuishou.cc/flows.php?step=add_to_cart1'
    header = {
        'User-Agent': "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:34.0) Gecko/20100101 Firefox/34.0",
        'Referer': "http://www.suhuishou.cc/goods.php?id=485",
        'Content-Type':"application/x-www-form-urlencoded",}
    Form_Data = {
        "quick": '1',
                 "spec": '"33553","33568","33572","33577","33579"',
                 "goods_id": '485',
                 "number": '1',
                 "parent": '0'}
    cookie=cookiejar.CookieJar()
    data = json.dumps(Form_Data)
    data = 'goods=%s' % data
    data = data.encode('utf-8')
    html=json.loads(PostUrl(url, data, cookie,header).decode('utf-8'))
    price=re.findall('总计金额 (\d*)。', str(html))
    print(price)
    #url = 'http://www.suhuishou.cc/flows.php?step=cart'
    #print(GetUrl(url, cookie))


