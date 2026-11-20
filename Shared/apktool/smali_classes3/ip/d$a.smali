.class public final Lip/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lip/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lip/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lip/d;

    invoke-direct {v0}, Lip/d;-><init>()V

    sput-object v0, Lip/d$a;->a:Lip/d;

    return-void
.end method
