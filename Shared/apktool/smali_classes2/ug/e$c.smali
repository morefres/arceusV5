.class public Lug/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lug/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lug/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lug/e;-><init>(Lug/f;)V

    sput-object v0, Lug/e$c;->a:Lug/e;

    return-void
.end method

.method public static bridge synthetic a()Lug/e;
    .locals 1

    sget-object v0, Lug/e$c;->a:Lug/e;

    return-object v0
.end method
