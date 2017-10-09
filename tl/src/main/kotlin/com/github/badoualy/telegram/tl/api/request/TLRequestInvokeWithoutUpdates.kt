package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestInvokeWithoutUpdates<T : TLObject>() : TLMethod<T>() {
    var query: TLMethod<T> = TLRequestHelpGetConfig() as TLMethod<T>

    private val _constructor: String = "invokeWithoutUpdates#bf9459b7"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(query: TLMethod<T>) : this() {
        this.query = query
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): T = query.deserializeResponse(tlDeserializer)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLMethod(query)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        query = readTLMethod<T>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += query.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestInvokeWithoutUpdates<*>) return false
        if (other === this) return true

        return query == other.query
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xbf9459b7.toInt()
    }
}