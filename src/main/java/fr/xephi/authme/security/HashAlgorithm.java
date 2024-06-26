package fr.xephi.authme.security;

import fr.xephi.authme.security.crypts.EncryptionMethod;

/**
 * Hash algorithms supported by AuthMe.
 */
public enum HashAlgorithm {

    ARGON2(fr.xephi.authme.security.crypts.Argon2.class),
    BCRYPT(fr.xephi.authme.security.crypts.BCrypt.class),
    BCRYPT2Y(fr.xephi.authme.security.crypts.BCrypt2y.class),
    CMW(fr.xephi.authme.security.crypts.CmwCrypt.class),
    CRAZYCRYPT1(fr.xephi.authme.security.crypts.CrazyCrypt1.class),
    IPB3(fr.xephi.authme.security.crypts.Ipb3.class),
    IPB4(fr.xephi.authme.security.crypts.Ipb4.class),
    JOOMLA(fr.xephi.authme.security.crypts.Joomla.class),
    MD5VB(fr.xephi.authme.security.crypts.Md5vB.class),
    MYBB(fr.xephi.authme.security.crypts.MyBB.class),
    PBKDF2(fr.xephi.authme.security.crypts.Pbkdf2.class),
    PBKDF2DJANGO(fr.xephi.authme.security.crypts.Pbkdf2Django.class),
    PHPBB(fr.xephi.authme.security.crypts.PhpBB.class),
    PHPFUSION(fr.xephi.authme.security.crypts.PhpFusion.class),
    ROYALAUTH(fr.xephi.authme.security.crypts.RoyalAuth.class),
    SALTED2MD5(fr.xephi.authme.security.crypts.Salted2Md5.class),
    SALTEDSHA512(fr.xephi.authme.security.crypts.SaltedSha512.class),
    SHA256(fr.xephi.authme.security.crypts.Sha256.class),
    SMF(fr.xephi.authme.security.crypts.Smf.class),
    TWO_FACTOR(fr.xephi.authme.security.crypts.TwoFactor.class),
    WBB3(fr.xephi.authme.security.crypts.Wbb3.class),
    WBB4(fr.xephi.authme.security.crypts.Wbb4.class),
    WORDPRESS(fr.xephi.authme.security.crypts.Wordpress.class),
    XAUTH(fr.xephi.authme.security.crypts.XAuth.class),
    XFBCRYPT(fr.xephi.authme.security.crypts.XfBCrypt.class),
    NOCRYPT(fr.xephi.authme.security.crypts.NoCrypt.class),
    CUSTOM(null),

    @Deprecated DOUBLEMD5(fr.xephi.authme.security.crypts.DoubleMd5.class),
    @Deprecated MD5(fr.xephi.authme.security.crypts.Md5.class),
    @Deprecated PLAINTEXT(null),
    @Deprecated SHA1(fr.xephi.authme.security.crypts.Sha1.class),
    @Deprecated SHA512(fr.xephi.authme.security.crypts.Sha512.class),
    @Deprecated WHIRLPOOL(fr.xephi.authme.security.crypts.Whirlpool.class);

    private final Class<? extends EncryptionMethod> clazz;

    /**
     * Constructor for HashAlgorithm.
     *
     * @param clazz The class of the hash implementation.
     */
    HashAlgorithm(Class<? extends EncryptionMethod> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends EncryptionMethod> getClazz() {
        return clazz;
    }

}
