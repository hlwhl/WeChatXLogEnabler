package com.linwei.electronicdream.wechathook

import android.util.Log
import com.gh0u1l5.wechatmagician.spellbook.interfaces.IXmlParserHook
import java.io.File
import java.io.OutputStream


object MsgHook : IXmlParserHook{
    override fun onXmlParsed(xml: String, root: String, result: MutableMap<String, String>) {
        Log.e("PARSEDXML", xml)
        File("/sdcard/sentLog").appendText(xml)
        File("/sdcard/sentLog").appendText("\n\n\n\n\n\n\n\n\n")
        super.onXmlParsed(xml, root, result)
    }
}