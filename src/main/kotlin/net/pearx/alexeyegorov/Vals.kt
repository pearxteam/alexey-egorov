package net.pearx.alexeyegorov

import java.nio.file.Path
import java.nio.file.Paths

const val DICTIONARY_URL = "http://opencorpora.org/files/export/dict/dict.opcorpora.xml.bz2"
val REGEX_IF_WHAT = Regex("если что(?:-?то)?(.*?)(?:[?\\n,.$]|$)", RegexOption.IGNORE_CASE)
val DICTIONARY_PATH: Path = Paths.get("dict.xml")
val NOUN_TAGS = arrayOf("NOUN", "NPRO")
val ADJECTIVE_TAGS = arrayOf("ADJF", "PRTF")
const val NOMINATIVE_TAG = "nomn"
val BTW_TRIGGERS = arrayOf("кстати", "кст", "btw", "кстате", "кстать", "бтв", "ботаве")