.class public final Lui/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lui/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/a;

    invoke-direct {v0}, Lui/a;-><init>()V

    sput-object v0, Lui/a$a;->a:Lui/a;

    return-void
.end method

.method public static bridge synthetic a()Lui/a;
    .locals 1

    sget-object v0, Lui/a$a;->a:Lui/a;

    return-object v0
.end method
