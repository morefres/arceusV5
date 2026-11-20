.class public Lfm/b$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static a:Lfm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/b;

    invoke-direct {v0}, Lfm/b;-><init>()V

    sput-object v0, Lfm/b$f;->a:Lfm/b;

    return-void
.end method

.method public static bridge synthetic a()Lfm/b;
    .locals 1

    sget-object v0, Lfm/b$f;->a:Lfm/b;

    return-object v0
.end method
