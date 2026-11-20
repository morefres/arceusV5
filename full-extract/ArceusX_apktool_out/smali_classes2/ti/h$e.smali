.class public Lti/h$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lti/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static final a:Lti/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lti/h;

    invoke-direct {v0}, Lti/h;-><init>()V

    sput-object v0, Lti/h$e;->a:Lti/h;

    return-void
.end method

.method public static bridge synthetic a()Lti/h;
    .locals 1

    sget-object v0, Lti/h$e;->a:Lti/h;

    return-object v0
.end method
