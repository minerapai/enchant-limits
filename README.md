# Enchant Limits (인챈트 제한)

인챈트 레벨의 상한과 모루 비용을 조정하는 모드입니다.

- 버전: 1.0.0
- Minecraft 1.21.1 / Fabric
- 필요한 모드: 없음 (Fabric Loader만 필요)
- 설치: 서버에만 넣으면 됩니다. 접속하는 사람(클라이언트)은 이 모드가 없어도 됩니다.

## 다운로드

**[⬇ enchant-limits-1.0.0.jar 다운로드](https://github.com/minerapai/enchant-limits/releases/download/v1.0.0/enchant-limits-1.0.0.jar)**

받은 jar 파일을 마인크래프트(또는 서버) 폴더의 `mods` 폴더에 넣으면 됩니다. 다른 버전은 [Releases](https://github.com/minerapai/enchant-limits/releases) 에 있습니다.

## 함께 써야 하는 데이터팩 ⚠

이 모드는 **enchant-plus 데이터팩**과 함께 쓰도록 만들었습니다. enchant-plus는 행운, 약탈, 효율, 날카로움, 내구성의 최대 레벨을 X까지 올리는 데이터팩입니다.

- enchant-plus가 있으면: 인챈트 테이블에서는 VI 레벨까지만 나오고, VII~X 레벨은 모루로 합쳐서만 만들 수 있습니다.
- enchant-plus 데이터팩은 따로 배포하지 않습니다.
- enchant-plus가 없으면: 바닐라 인챈트는 원래 V 레벨이 최대라서 레벨 제한은 아무 효과가 없고, 모루 '너무 비쌉니다!' 제거 기능만 동작합니다.

## 기능

- 인챈트 테이블, 상자 보상, 주민 거래에서 나오는 무작위 인챈트는 최대 VI 레벨까지만 나옵니다. 그보다 높은 레벨은 모루로만 만들 수 있습니다.
- 모루에서 '너무 비쌉니다!'가 뜨지 않습니다 (비용 최대 39 레벨).

## 사용법

| 명령어 | 설명 |
|---|---|
| (명령어 없음) | 넣기만 하면 자동으로 적용됩니다. |

(OP) 표시가 있는 명령어는 서버 관리자(OP)만 쓸 수 있습니다.

## 빌드

```bash
./gradlew build
```

`build/libs/` 에 만들어진 jar 파일을 서버의 `mods` 폴더에 넣습니다.

## 라이선스

MIT License. 출처(minerapai)만 밝히면 누구나 자유롭게 쓰고 고치고 배포할 수 있습니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 보세요.
