package com.linwei.electronicdream.wechathook

import android.util.Log
import com.gh0u1l5.wechatmagician.spellbook.interfaces.IXLogHook

object LogHook : IXLogHook{
    override fun onXLogWrite(level: String, tag: String, msg: String) {
        super.onXLogWrite(level, tag, msg)
        Log.e("HOOKEDXLOG"+tag,msg)
    }
}