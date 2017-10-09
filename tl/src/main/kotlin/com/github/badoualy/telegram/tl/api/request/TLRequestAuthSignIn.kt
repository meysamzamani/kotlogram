package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.api.auth.TLAuthorization
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestAuthSignIn() : TLMethod<TLAuthorization>() {
    var phoneNumber: String = ""

    var phoneCodeHash: String = ""

    var phoneCode: String = ""

    private val _constructor: String = "auth.signIn#bcd51581"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            phoneNumber: String,
            phoneCodeHash: String,
            phoneCode: String
    ) : this() {
        this.phoneNumber = phoneNumber
        this.phoneCodeHash = phoneCodeHash
        this.phoneCode = phoneCode
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLAuthorization = tlDeserializer.readTLObject(TLAuthorization::class, TLAuthorization.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(phoneNumber)
        writeString(phoneCodeHash)
        writeString(phoneCode)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        phoneNumber = readString()
        phoneCodeHash = readString()
        phoneCode = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(phoneNumber)
        size += computeTLStringSerializedSize(phoneCodeHash)
        size += computeTLStringSerializedSize(phoneCode)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestAuthSignIn) return false
        if (other === this) return true

        return phoneNumber == other.phoneNumber
                && phoneCodeHash == other.phoneCodeHash
                && phoneCode == other.phoneCode
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xbcd51581.toInt()
    }
}