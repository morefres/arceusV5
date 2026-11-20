.class public Lti/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lti/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lti/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lti/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lti/e;-><init>(Lti/f;)V

    sput-object v0, Lti/e$d;->a:Lti/e;

    return-void
.end method

.method public static bridge synthetic a()Lti/e;
    .locals 1

    sget-object v0, Lti/e$d;->a:Lti/e;

    return-object v0
.end method
