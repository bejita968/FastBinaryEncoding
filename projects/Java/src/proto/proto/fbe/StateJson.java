// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.2.0.0

package proto.fbe;;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

import com.google.gson.*;

public final class StateJson implements JsonSerializer<State>, JsonDeserializer<State>
{

    @Override
    public JsonElement serialize(State src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public State deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new State(json.getAsJsonPrimitive().getAsByte());
    }
}
