.class public Ldk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ldk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldk/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk/c;-><init>(Ldk/d;)V

    sput-object v0, Ldk/c$a;->a:Ldk/c;

    return-void
.end method

.method public static bridge synthetic a()Ldk/c;
    .locals 1

    sget-object v0, Ldk/c$a;->a:Ldk/c;

    return-object v0
.end method
